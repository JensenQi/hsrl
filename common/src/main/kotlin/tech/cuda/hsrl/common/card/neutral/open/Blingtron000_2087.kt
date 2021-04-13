package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blingtron000_2087 : Card() {
    override val id = 2087
    override val name = "布林顿3000型"
    override val description = "<b>战吼：</b>为每个玩家装备一把武器。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "启动布林顿，让所有参加派对的人都嗨起来！"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/678e07f99e276ac90293996f26b018c1ab9403fce7e77bf4b2ee784211c50873.png"
}

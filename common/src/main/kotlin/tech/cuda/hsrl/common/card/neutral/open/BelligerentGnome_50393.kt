package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BelligerentGnome_50393 : Card() {
    override val id = 50393
    override val name = "好斗的侏儒"
    override val description = "<b>嘲讽</b> <b>战吼：</b>如果你的对手拥有2个或者更多随从，便获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "江湖人称“嘴强王者”。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/47a5b85f83bcb83e8b65fb87799c3bbe1c43a420cae14f86b02c05bc3b9032d9.png"
}

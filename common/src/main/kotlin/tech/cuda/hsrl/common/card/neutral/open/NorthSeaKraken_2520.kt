package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NorthSeaKraken_2520 : Card() {
    override val id = 2520
    override val name = "北海海怪"
    override val description = "<b>战吼：</b>造成4点伤害。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "老有人要放海怪，海怪自己都觉着累了。"
    override val artist = "Seamus Gallagher"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aaebd9202590a35537a9d94547b825e9e515f2460fe8800be27352f711ee04b3.png"
}

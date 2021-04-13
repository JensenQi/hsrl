package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeSpirit_40527 : Card() {
    override val id = 40527
    override val name = "青玉之灵"
    override val description = "<b>战吼：</b>召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "“他好可爱啊！我真想把他捏碎了用来做青玉魔像！”——艾雅·黑掌"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/967ca1912a4ddfd29c89d3f927db3ba453cc19ef9bdc29768c5a1f37be41f286.png"
}

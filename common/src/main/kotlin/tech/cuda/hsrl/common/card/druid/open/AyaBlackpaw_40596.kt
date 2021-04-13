package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AyaBlackpaw_40596 : Card() {
    override val id = 40596
    override val name = "艾雅·黑掌"
    override val description = "<b>战吼，亡语：</b>召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "别看艾雅年纪轻，她可是玉莲帮的实际掌权者。看似天真活泼的少女，转眼之间便能召唤出魔像大军，将敌人统统碾碎！"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b3251fdc29b679cfaa2d0a1934859788b89ae9d39065a839475989745ca4059.png"
}

package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodhoofBrave_38738 : Card() {
    override val id = 38738
    override val name = "血蹄勇士"
    override val description = "<b>嘲讽</b> 受伤时具有+3攻 击力。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "上古之神对他低语了很长时间他才回过神来，看来这位勇士真的该好好检查一下听力了。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38031c9f1040a6b525e2fc6b80f7c3192a058ba489995a6ebd07ced0f9928135.png"
}

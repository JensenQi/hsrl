package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DayAtTheFaire_61218 : Card() {
    override val id = 61218
    override val name = "游园日"
    override val description = "召唤三个白银之手新兵。<b>腐蚀：</b>召唤五个。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "卡尔感觉到了，自己终有一天会因为那根火鸡腿而后悔。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6268799c953dc408be384f0022cef96edf377db438caf8bc497296212cbaea5e.png"
}

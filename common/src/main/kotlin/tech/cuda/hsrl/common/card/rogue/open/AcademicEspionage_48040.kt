package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AcademicEspionage_48040 : Card() {
    override val id = 48040
    override val name = "学术剽窃"
    override val description = "将十张你对手职业的卡牌洗入你的牌库，其法力值消耗为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "十个炎爆术下去，你还欠我70血。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93edfd98166256d89ae05c80261e45eae615b2006a85addfeca7591bc34eb647.png"
}

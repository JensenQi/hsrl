package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IllidariStudies_61939 : Card() {
    override val id = 61939
    override val name = "伊利达雷研习"
    override val description = "<b>发现</b>一张<b>流放</b>牌。你的下一张<b>流放</b>牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“请勿在驾驶期间研习。”"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3a1b947aa3f467bcec898db7fdcfb2d90f0384dc0a4b41f21e626831ebf72cf.png"
}

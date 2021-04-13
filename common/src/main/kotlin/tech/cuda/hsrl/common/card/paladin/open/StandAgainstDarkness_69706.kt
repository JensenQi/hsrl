package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StandAgainstDarkness_69706 : Card() {
    override val id = 69706
    override val name = "惩黑除恶"
    override val description = "召唤五个1/1的白银之手新兵。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "对抗黑暗，伸张正义，是每一位圣骑士的毕生信念。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e988f5c345c07325f4d11244a36564b61333002c398fa56760cd1e740192d88f.png"
}

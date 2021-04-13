package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineStrength_38749 : Card() {
    override val id = 38749
    override val name = "神圣之力"
    override val description = "使一个随从获得+1/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "每年总会有个别圣骑士在西部荒野举重大赛上偷偷使用这一招，导致因作弊而被淘汰出局。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb60c2591259a890e3b819ac104a87e8ac7efddac8c2b23eebe5e6a1dfbe57f0.png"
}

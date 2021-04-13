package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RuneforgeHaunter_42819 : Card() {
    override val id = 42819
    override val name = "符文熔铸游魂"
    override val description = "在你的回合时，你的武器不会失去 耐久度。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "别担心，他会用一只眼睛帮你盯着的。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06adcd77609b187570bdcc917a806e575bc2101e499d9b1f8725eff88d9551fc.png"
}

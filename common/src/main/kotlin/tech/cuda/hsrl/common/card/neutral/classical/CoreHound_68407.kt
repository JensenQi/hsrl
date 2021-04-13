package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoreHound_68407 : Card() {
    override val id = 68407
    override val name = "熔火恶犬"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 9
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你无法驯服一头熔火恶犬。你只能通过训练让它在吃掉你之前先吃掉其他人。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a329245c83232a11067d5da151137fe2086b7617cc0dee9d3490aa068b8fd93f.png"
}

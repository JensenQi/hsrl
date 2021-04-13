package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoreHound_1687 : Card() {
    override val id = 1687
    override val name = "熔火恶犬"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "你无法驯服一头熔火恶犬。你只能通过训练让它在吃掉你之前先吃掉其他人。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/21102c12d78e1d37617702a0a0842de99247df21cebc0f2d7252518edbb54045.png"
}

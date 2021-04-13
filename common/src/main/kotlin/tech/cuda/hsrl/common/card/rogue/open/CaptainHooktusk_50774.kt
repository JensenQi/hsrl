package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaptainHooktusk_50774 : Card() {
    override val id = 50774
    override val name = "钩牙船长"
    override val description = "<b>战吼：</b>从你的牌库中召唤三个海盗，并使其获得<b>突袭</b>。"
    override var cost: Int? = 8
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“你们仨儿！蹲大炮里去！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75a4e75cddea03fd9a27d7ece9a21ea793447ccea6def980358374905edf8367.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightsCall_45353 : Card() {
    override val id = 45353
    override val name = "暮光召唤"
    override val description = "召唤两个在本局对战中死亡，并具有<b>亡语</b>的友方随从的1/1复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“如果你得了复活综合症，请打1。”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32e366ce7cd41c921d48b7a44b093d2b9800f7df00232324378dd6bd33d4841f.png"
}

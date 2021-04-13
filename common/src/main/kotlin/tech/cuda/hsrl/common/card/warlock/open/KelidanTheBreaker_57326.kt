package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KelidanTheBreaker_57326 : Card() {
    override val id = 57326
    override val name = "击碎者克里丹"
    override val description = "<b>战吼：</b>消灭一个随从。如果该牌在本回合被抽到，则改为消灭除此随从外的所有随从。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "只要给他一个回合，他就能冷静不少。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e475f68da4daaa5a302de46f12c298399e160bd661fc6ca95890874dc7db3544.png"
}

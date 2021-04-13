package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HozenHealer_40344 : Card() {
    override val id = 40344
    override val name = "猢狲医者"
    override val description = "<b>战吼：</b>为一个随从恢复所有生命值。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他的一些土方看起来很怪异，但是药到病除。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c7636fdb294da2d92a0e2b93978414dc86a8243b45c0e5b671fa537150f26145.png"
}

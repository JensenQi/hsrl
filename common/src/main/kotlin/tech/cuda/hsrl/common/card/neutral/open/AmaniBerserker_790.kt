package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AmaniBerserker_790 : Card() {
    override val id = 790
    override val name = "阿曼尼狂战士"
    override val description = "受伤时具有+3攻 击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "如果阿曼尼狂战士问你：“你刚才看着我？！”正确的答案应该是：“没有，伙计。”"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/13400334d6b7dd5d878bb630de108fbdf020789fd7df3a7eed346ec3b832c1c4.png"
}

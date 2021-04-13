package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KorvasBloodthorn_64467 : Card() {
    override val id = 64467
    override val name = "考瓦斯·血棘"
    override val description = "<b>冲锋</b>，<b>吸血</b> 在你使用一张<b>流放</b>牌后，将该随从移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "伊利丹曾教导她：成为恶魔猎手需要牺牲一切……但她还是留下了吸血，以防万一嘛。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be95c5ebe342e2590b334b758a270fdeec5bd3c59955465df82f64c093813482.png"
}

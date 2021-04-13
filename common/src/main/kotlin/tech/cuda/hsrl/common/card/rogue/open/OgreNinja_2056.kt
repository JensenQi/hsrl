package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OgreNinja_2056 : Card() {
    override val id = 2056
    override val name = "食人魔忍者"
    override val description = "<b>潜行，</b>50%几率攻击错误的敌人。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "他通过走后门进入了忍者学院，但总是通不过偷取毕业证书的考试。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a8f8a2a6b54cb55885b72eccc1f9bdb8143d3992930dff85e47050b1d9cc08a.png"
}

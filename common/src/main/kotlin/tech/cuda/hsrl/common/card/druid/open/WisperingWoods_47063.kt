package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WisperingWoods_47063 : Card() {
    override val id = 47063
    override val name = "精灵之森"
    override val description = "你每有一张手牌，便召唤一个1/1的小精灵。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "事实上，命名黑暗私语的家伙并没有被开除。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9cf71e2e9ab2164c63ee33bb5a1fb2d85c1fbe024d92273dfced7bc13ebe2a19.png"
}

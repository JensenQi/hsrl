package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClearTheWay_55288 : Card() {
    override val id = 55288
    override val name = "扫清道路"
    override val description = "<b>支线任务：</b> 召唤三个<b>突袭</b>随从。<b>奖励：</b>召唤一头4/4并具有<b>突袭</b>的狮鹫。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "这个任务最可怕的部分就是狮鹫在最后的叫声。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae0d69ba24c16ea81ec836a58a843f0f7c924ead41ff0cd099733beb1c76ed81.png"
}

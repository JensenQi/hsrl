package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NerubarWeblord_1800 : Card() {
    override val id = 1800
    override val name = "尼鲁巴蛛网领主"
    override val description = "具有<b>战吼</b>的随从法力值消耗增加（2）点。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "蛛网领主的工作就是每天制作超大型蹦床。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81c027edd6e42f21b3a4c51468b3be5106b2e4161df840489f8b20c08b3b07c7.png"
}

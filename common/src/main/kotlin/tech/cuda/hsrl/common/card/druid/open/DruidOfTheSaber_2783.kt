package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheSaber_2783 : Card() {
    override val id = 2783
    override val name = "刃牙德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为2/1并具有<b>冲锋</b>；或者将该随从变形成为3/2并具有<b>潜行</b>。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "刃牙极其锋利，绝非一般的海盗刀剑所能比拟。俗话说牙好胃口就好，吃什么都香。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8f4e54019860095bee47b83438fe14ccbc92eee43583f1b2eede2ff8b9eb4f5.png"
}

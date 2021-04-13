package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowboxer_2040 : Card() {
    override val id = 2040
    override val name = "暗影打击装甲"
    override val description = "每当一个随从获得治疗，便随机对一个敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "一个地精牧师发明了使用暗影作为能源的战斗机器人。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83f2a11e48bd0574224f61bc76def9d5994aeedbd1226c586731efe5a6d8937b.png"
}

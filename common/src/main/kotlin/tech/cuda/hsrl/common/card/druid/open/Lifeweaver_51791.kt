package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lifeweaver_51791 : Card() {
    override val id = 51791
    override val name = "织命者"
    override val description = "每当有角色获得你的治疗时，随机将一张德鲁伊法术牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "织命到死丝方尽。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4096ca48f94a5051bd0a846092a6f3d634d33467a892372c8aa3d9e1541675c1.png"
}

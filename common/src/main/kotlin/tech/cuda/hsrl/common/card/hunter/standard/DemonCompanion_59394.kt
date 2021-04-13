package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DemonCompanion_59394 : Card() {
    override val id = 59394
    override val name = "恶魔伙伴"
    override val description = "随机召唤一个恶魔伙伴。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "养了宠物之后，有时就会感觉自己在和恶魔作伴。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e4658b7ca2c22b429adadd193ac629e18ff05e604b7561d8e7e0fa619044da9.png"
}

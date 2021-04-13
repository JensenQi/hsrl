package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HealingWave_2612 : Card() {
    override val id = 2612
    override val name = "治疗波"
    override val description = "恢复 7点生命值。揭示双方牌库里的一张随从牌。如果你的牌法力值 消耗较大，改为恢复 14点生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "恢复系萨满最钟爱的技能之一。治疗效果出众，广受盟友好评。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f46422ebe8f7bfe3a13c448a9b64d29fecaf5d1cb128e0f28b8fc1433f0cbc4.png"
}

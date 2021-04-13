package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Evocation_56389 : Card() {
    override val id = 56389
    override val name = "唤醒"
    override val description = "随机将法师法术牌置入你的手牌，直到你的手牌数量达到上限。在你的回合结束时，弃掉它们。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "一切有为法，如露亦如电。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b099072d33ec0fb0cf059f94919eb3c1a81c2e41f7362255332e8b2896f0f6d.png"
}

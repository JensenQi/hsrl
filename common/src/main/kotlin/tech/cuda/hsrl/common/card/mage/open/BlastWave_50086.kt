package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlastWave_50086 : Card() {
    override val id = 50086
    override val name = "冲击波"
    override val description = "对所有随从造成 2点伤害。<b>超杀</b>：随机将一张法师法术牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "如果感到燥热你就挥挥手！"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4fd3aceec7c6878567d9eabde91d578149fc2ed1eea410ffedbc1faa80a8237.png"
}

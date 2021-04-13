package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RocketBoots_47925 : Card() {
    override val id = 47925
    override val name = "火箭靴"
    override val description = "使一个随从获得<b>突袭</b>。抽 一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "这是格里克一生中最开心的时刻，我们会怀念他的。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05794ae15790bbf41484a4e80dc53bf41adf1e383f029b9d6f6a0e3b498ea43a.png"
}

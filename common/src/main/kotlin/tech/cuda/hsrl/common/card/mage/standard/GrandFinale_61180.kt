package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandFinale_61180 : Card() {
    override val id = 61180
    override val name = "华丽谢幕"
    override val description = "召唤一个8/8的元素。你在上个回合每使用一张元素牌，重复一次。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "一想到暗月马戏团的其他种种危险，肆意纵火都显得那么人畜无害。"
    override val artist = "E. Li & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06a0b34d0b893a86b18cd8b1f0b76db3b540ffe386c22d5bf5dedb7989998646.png"
}

package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladeFlurry_69766 : Card() {
    override val id = 69766
    override val name = "剑刃乱舞"
    override val description = "摧毁你的武器，对所有敌人造成等同于其攻击力的伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "“注意看好，并不是把匕首飞快地挥来挥去就行了，比那要复杂得多。”——潜行者训练师，肖"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9279346f8b0847c8252898282361f7335e4b072c75543a310e69a730ba569cf0.png"
}

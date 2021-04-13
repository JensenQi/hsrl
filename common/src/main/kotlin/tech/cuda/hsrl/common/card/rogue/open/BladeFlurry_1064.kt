package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladeFlurry_1064 : Card() {
    override val id = 1064
    override val name = "剑刃乱舞"
    override val description = "摧毁你的武器，对所有敌方随从 造成等同于其攻击力的伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "“注意看好，并不是把匕首飞快地挥来挥去就行了，比那要复杂得多。”——潜行者训练师，肖"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8bd6a0a223f5c9577b655832b1a72ad6a9a15a2062eb2f45b4c8137cdae5c425.png"
}

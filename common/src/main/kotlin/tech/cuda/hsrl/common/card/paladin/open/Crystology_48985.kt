package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crystology_48985 : Card() {
    override val id = 48985
    override val name = "水晶学"
    override val description = "从你的牌库中抽两张攻击力为1的随从牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“光既不是波也不是粒子，它更像是一种流质，真的。”"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36bc1289f46476b7cb408a01c5d3f563fd39ea9e0f8a6253cc5858d7db35a706.png"
}

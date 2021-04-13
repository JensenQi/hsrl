package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BranchingPaths_43294 : Card() {
    override val id = 43294
    override val name = "分岔路口"
    override val description = "<b>选择两次：</b> 抽一张牌；使你的所有随从获得+1攻击力；或者获得6点护甲值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "黑色的大厅中有三条岔路 可惜我不能同时涉足 我选择了人迹罕至的一条 结果却被软泥怪吃掉"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9cbe7fa602bab123fb4552b4cfb27b43fbcd5ee9a85a847d6e88f8b946ea29aa.png"
}

package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfKings_69530 : Card() {
    override val id = 69530
    override val name = "王者祝福"
    override val description = "使一个随从获得+4/+4。<i>（+4攻击力/+4生命值）</i>"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "你知道世界上有多少所谓的“王者”被暗杀了吗？你确定还想要王者祝福吗？"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f17e4929b8a801dd97c82b9df1ec8197446a84dc4ab36400b5731e88325db5cf.png"
}

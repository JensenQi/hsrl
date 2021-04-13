package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RiggedFaireGame_61585 : Card() {
    override val id = 61585
    override val name = "非公平游戏"
    override val description = "<b>奥秘：</b> 如果你在对手的回合没有受到任何伤害，抽三张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "全称是“非常公平的游戏”。"
    override val artist = "J. Cheung & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14abe4ec02d12b727d15e9921a0681df188bfc7d0fc3dc7f8dce296ee5e23c82.png"
}

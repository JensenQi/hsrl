package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeSwarmer_40697 : Card() {
    override val id = 40697
    override val name = "青玉游荡者"
    override val description = "<b>潜行，亡语：</b>召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "所到之处，寸草不生。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48fed1890a0eaaaf80b1b7debf6eed47252202ae1da424e616908d67934c92a7.png"
}

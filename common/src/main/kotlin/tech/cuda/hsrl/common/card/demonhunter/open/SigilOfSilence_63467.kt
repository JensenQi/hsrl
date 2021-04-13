package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SigilOfSilence_63467 : Card() {
    override val id = 63467
    override val name = "沉默咒符"
    override val description = "在你的下个回合开始时，<b>沉默</b>所有敌方随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "其他咒符的量词是个，这个要用“听”。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf1363108be9ac3b59ff5d9a4ff99278dd5c95bda9aeb3d4f76a731515309ee4.png"
}

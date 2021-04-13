package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LadyVashj_56420 : Card() {
    override val id = 56420
    override val name = "瓦丝琪女士"
    override val description = "<b>法术伤害+1</b> <b>亡语：</b>将“终极瓦丝琪”洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "艾萨拉女王的私人侍女，变成了伊利丹·怒风的副官。兼任发型嘶嘶嘶……师。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd3b285ba74e3f270cc9c44c5c77963df0ac9aac013f91eeb0ac042f22c4f731.png"
}

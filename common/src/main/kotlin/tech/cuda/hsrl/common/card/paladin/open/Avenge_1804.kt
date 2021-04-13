package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Avenge_1804 : Card() {
    override val id = 1804
    override val name = "复仇"
    override val description = "<b>奥秘：</b>当你的随从死亡时，随机使一个友方随从获得+3/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Naxx
    override val background = "有几个身怀绝技的圣骑士想要组成一个团体来声张正义，并自称“复仇者联盟”。不久，他们受到了某家电影公司的起诉。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1cede17eb72ac2196044ccf14d36b9c7752025e2daf013331aa8f006d55a082.png"
}

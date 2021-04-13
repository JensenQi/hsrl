package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserDiamondSpellstone_46307 : Card() {
    override val id = 46307
    override val name = "小型法术钻石"
    override val description = "复活两个不同的友方随从。 <i>（施放四个法术后升级。）</i>"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“第八颗石头是洁白的钻石，珍贵的宝石激励纯粹的信仰。低声的祈祷可以让逝者苏生，但没人知道要付出怎样的代价。”——《魔石》"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d168617916fc74506d1bd62fb9b7024de6d81c77c8e12b9f0ded661a450a1b71.png"
}

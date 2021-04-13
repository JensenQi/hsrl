package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hadronox_43439 : Card() {
    override val id = 43439
    override val name = "哈多诺克斯"
    override val description = "<b>亡语：</b>召唤所有你在本局对战中死亡的，并具有<b>嘲讽</b>的随从。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "艾卓-尼鲁布的元老释放出哈多诺克斯作为抵御巫妖王的最后一道防线。他们非常小心地在一家主流报纸上进行了抢先报道。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/90276c2e4839a8e27fb1b626dd70970ccd52a6acb0d45fdd6b341efd3fab9316.png"
}

package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WispsOfTheOldGods_38655 : Card() {
    override val id = 38655
    override val name = "上古之神的小精灵"
    override val description = "<b>抉择：</b>召唤七个1/1的小精灵；或者使你的所有随从获得+2/+2。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "只不过是打上了“上古之神”的商标，其实和普通的小精灵并无二致。"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec3db24c9278e1fbd6446c5f215b640563caa24892cec72438a80c11b63aa0ea.png"
}

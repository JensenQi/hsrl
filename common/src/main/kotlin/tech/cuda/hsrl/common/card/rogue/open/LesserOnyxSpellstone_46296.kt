package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserOnyxSpellstone_46296 : Card() {
    override val id = 46296
    override val name = "小型法术黑曜石"
    override val description = "随机消灭一个敌方随从。 <i>（使用三张<b>亡语</b>牌后升级。）</i>"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“古代的巨魔拥抱了这份礼物，黑色的石头如匕首一般锋利。找到这石头的人身边再也没有同伴，不管谁得到它都注定孤独终老。”——《魔石》"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/beb2a860b1e32b44414e48b50ab7e0e512a5463a93583b41de9e8867535e5941.png"
}

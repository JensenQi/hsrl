package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KnifeVendor_61620 : Card() {
    override val id = 61620
    override val name = "小刀商贩"
    override val description = "<b>战吼：</b>对每个英雄造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我的刀用起来绝对安全！戴手套才不是为了掩盖手上的创可贴。”"
    override val artist = "Angelica Alieva"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/884370a9fa992ae8bfe06f3c4cdff5a68fff499b48966e48ae7b16afc2dea103.png"
}

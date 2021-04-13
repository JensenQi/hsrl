package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Springpaw_49824 : Card() {
    override val id = 49824
    override val name = "魔泉山猫"
    override val description = "<b>突袭，战吼：</b>将一张1/1并具有<b>突袭</b>的山猫置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "山猫是种可怕的动物，嘴里长着尖利的大牙，还有弹性十足的魔泉猫爪！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60657a044ff1a7cc6312b5e8c70f254eb55d5320f11f8ca01a9f9067e40fe572.png"
}

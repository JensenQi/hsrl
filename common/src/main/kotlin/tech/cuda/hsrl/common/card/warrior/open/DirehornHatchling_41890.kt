package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DirehornHatchling_41890 : Card() {
    override val id = 41890
    override val name = "恐角龙宝宝"
    override val description = "<b>嘲讽，亡语：</b> 将一张6/9并具有<b>嘲讽</b>的“恐角龙头领”洗入你的牌库。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "打恐龙也要看妈妈。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4773277e4cc06db36a520fd130e70d94d136ca424526fa770f50fbdadcb90075.png"
}

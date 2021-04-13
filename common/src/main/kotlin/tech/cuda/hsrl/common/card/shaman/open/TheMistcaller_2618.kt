package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheMistcaller_2618 : Card() {
    override val id = 2618
    override val name = "唤雾者伊戈瓦尔"
    override val description = "<b>战吼：</b>使你的手牌和牌库里的所有随从牌获得+1/+1。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "唤雾者召来的不光有雾，还有霾。记得戴口罩。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17e4f43ca3f1c586df22a9b1c1c9e70f646c7b0b66bbc93a3c9211dc8f2d35ef.png"
}

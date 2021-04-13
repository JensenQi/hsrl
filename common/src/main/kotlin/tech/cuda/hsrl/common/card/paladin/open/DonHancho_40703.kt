package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DonHancho_40703 : Card() {
    override val id = 40703
    override val name = "唐·汉古"
    override val description = "<b>战吼：</b>随机使你手牌中的一张随从牌获得+5/+5。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "作为污手党家族的主心骨，汉有时候真想把愚钝的古扫地出门，但他没法这么做。"
    override val artist = "Tyson Murphy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3abbf19403db8627b9babdbd81715ee8762b9e55fbe58ea41b58232fa7dd76b.png"
}

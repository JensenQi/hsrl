package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighExarchYrel_61192 : Card() {
    override val id = 61192
    override val name = "大主教伊瑞尔"
    override val description = "<b>战吼：</b>如果你的牌库中没有中立卡牌，获得<b>突袭</b>，<b>吸血</b>，<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "对抗黑暗的战斗中，容不得中立的存在。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f91708e79b9e7ab626f0ab1c9b49342ffce1fecfadb2c91cab8617cd2c5e165.png"
}

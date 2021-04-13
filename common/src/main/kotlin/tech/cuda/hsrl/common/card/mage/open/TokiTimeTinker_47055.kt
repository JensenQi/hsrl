package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TokiTimeTinker_47055 : Card() {
    override val id = 47055
    override val name = "时光修补匠托奇"
    override val description = "<b>战吼：</b>随机将一张狂野<b>传说</b>随从牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "往左转一点，再往右转小半圈，然后……哎呀！好吧，反正我们也不需要那条时间线。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51ffb315fee95f03f65b72ded06f1c8c531c2f07b47348c4ad7fdb36dedcd3c6.png"
}

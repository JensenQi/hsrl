package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoreRager_2263 : Card() {
    override val id = 2263
    override val name = "熔火怒犬"
    override val description = "<b>战吼：</b>如果你没有其他手牌，则获得+3/+3。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Brm
    override val background = "有些猎人就是喜欢稀奇古怪的宠物，比如深入炎热无比的熔岩坑，哄骗一头在那里长大的野兽跟他回家，还要乖乖地和其他宠物呆在兽栏里……"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0427a010bfcf6b4de9f51ebdbbc7c9c06b72f1241d0a8fef8ff9b5d07b7d0101.png"
}
